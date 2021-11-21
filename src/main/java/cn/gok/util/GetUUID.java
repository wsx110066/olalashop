package cn.gok.util;

import java.util.UUID;

/**
 * @author 14489
 */
public class GetUUID {

    public static String getUUID() {
        UUID id = UUID.randomUUID();
        String[] idd = id.toString().split("-");
        return idd[0] + idd[1] + idd[2];
    }
}
