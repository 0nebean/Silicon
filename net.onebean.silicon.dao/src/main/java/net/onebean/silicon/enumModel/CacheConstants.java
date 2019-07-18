package net.onebean.silicon.enumModel;

import net.onebean.util.StringUtils;

public class CacheConstants {




    /**
     * 生成key
     * @param keys keys
     * @return key
     */
    public static String generateKey(String ...keys){
        StringBuilder stringBuilder = new StringBuilder();
        for (String key : keys) {
            if(StringUtils.isNotEmpty(key)){
                stringBuilder.append(key).append(":");
            }
        }
        String key = stringBuilder.toString();
        return key.substring(0,key.length()-1);
    }

}
