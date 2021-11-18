$(function () {
    //全部删除
    $("#deleteAll_btn").on("click", function () {
        $("input[name='check_Id']:checked").each(function () {
            var shopCartId = $(this).val();
            $.ajax({
                type: "POST",
                url: "/olalashop/orderCartApi/removeShopCart.do",
                dataType: "json",
                async: "true",
                data: {
                    "shopCartId": shopCartId
                },
                success: function (data) {
                    if (data == "10000") {
                        alert("删除成功！")
                    } else {
                        alert("删除失败！")
                    }
                    $("#item_" + shopCartId).remove();
                }
            })
        });
    })

    //全部收藏
    $("#collect_btn").on("click", function () {
        $("input[name='check_Id']:checked").each(function () {
            var shopCartId = $(this).val();
            console.log(shopCartId)
            var customerId = $("#customerId_" + shopCartId).val();
            console.log(customerId)
            var goodsId = $("#goodsId_" + shopCartId).val();
            console.log(goodsId)

            $.ajax({
                type: "POST",
                url: "/olalashop/personalCenter/saveCollect.do",
                dataType: "json",
                async: "true",
                data: {
                    "customerId": customerId,
                    "goodsId": goodsId,
                    "source": "2"
                },
                success: function (data) {
                    if (data == "10000") {
                        alert("收藏成功");
                        $("#collect_btn_" + shopCartId).text("已收藏");
                    } else if (data == "-10001") {
                        alert("已收藏")
                        $("#collect_btn_" + shopCartId).text("已收藏");
                    } else {
                        alert("收藏失败");

                    }

                },
                error: function (data) {

                }
            })
        });
    })

    //购物车选中事件计算金额
    $("input[name='check_Id']").change(function () {
        account();
    });

    //全选和全不选
    $("#J_SelectAllCbx2").change(function () {
        var totalPrice = 0;
        var count = 0;
        var isChecked = $("#J_SelectAllCbx2").is(':checked');
        //获取所有checkbox组成的数组
        var checkedArrs = $("input[name='check_Id']");
        //判断是全选还是反选
        if (isChecked) {
            checkedArrs.each(function () {
                $(this).prop('checked', true);
                var shopCartId = $(this).val();
                var price = $("#price_" + shopCartId).val();
                var amount = $("#amount_" + shopCartId).val();
                count += Number(amount);
                totalPrice += Number(price) * Number(amount);
            });
            $("#J_SelectedItemsCount").text(count);
            $("#J_Total").text(totalPrice);
        } else {
            checkedArrs.each(function () {
                $(this).removeAttr('checked', false);
            });
            $("#J_SelectedItemsCount").text(0);
            $("#J_Total").text(0);
        }
    });

})

//逐条删除
function deleteShopCart(shopCartId) {
    $.ajax({
        type: "POST",
        url: "/olalashop/orderCartApi/removeShopCart.do",
        dataType: "json",
        async: "true",
        data: {
            "shopCartId": shopCartId
        },
        success: function (data) {
            if (data == "10000") {
                alert("删除成功！")
            } else {
                alert("删除失败！")
            }
            $("#item_" + shopCartId).remove();
        }
    })
}

//逐个收藏
function addCollect(shopCartId, customerId, goodsId) {
    $.ajax({
        type: "POST",
        url: "/olalashop/personalCenter/saveCollect.do",
        dataType: "json",
        async: "true",
        data: {
            "customerId": customerId,
            "goodsId": goodsId,
            "source": "2"
        },
        success: function (data) {
            if (data == "10000") {
                alert("收藏成功");
                $("#collect_btn_" + shopCartId).text("已收藏");
            } else if (data == "-10001") {
                alert("已收藏")
                $("#collect_btn_" + shopCartId).text("已收藏");
            } else {
                alert("收藏失败");

            }

        },
        error: function (data) {

        }
    })
}

/*购物车结算*/
function settleOrder() {
    var shopCartIdArr = "";
    var amountArr = "";
    $("input[name='check_Id']:checked").each(function () {
        var shopCartId = $(this).val();
        var amount = $("#amount_" + shopCartId).val();
        shopCartIdArr += shopCartId + ",";
        amountArr += amount + ",";
    });
    if (shopCartIdArr == "") {
        alert("请选择需要结算的商品！");
        return;
    }
    window.location.href = "/olalashop/orderApi/settleShopCart.do?shopCartIdArr=" + shopCartIdArr + "&amountArr=" + amountArr;
}

//加减数量
function resetAmount(shopCartId, method) {
    var amount = $("#amount_" + shopCartId).val();
    if (method == "-" && amount > 1) {
        $("#amount_" + shopCartId).val(Number(amount) - 1);
    } else if (method == "+") {
        $("#amount_" + shopCartId).val(Number(amount) + 1);
    }
    account();
    return;
}

//统计金额和数量
function account() {
    var totalPrice = 0;
    var count = 0;
    $("input[name='check_Id']").each(function () {
        var shopCartId = $(this).val();
        var isChecked = $(this).is(':checked');
        if (isChecked) {
            var price = $("#price_" + shopCartId).val();
            var amount = $("#amount_" + shopCartId).val();
            count += Number(amount);
            totalPrice += Number(price) * Number(amount);
        }
    });
    $("#J_SelectedItemsCount").text(count);
    $("#J_Total").text(totalPrice);
}
