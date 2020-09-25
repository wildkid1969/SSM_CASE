package com.wildkid.datasource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: mengya
 * @Date: 2020-09-25 19:11
 */
public class DynamicDataSourceHolder {

    private static final Logger LOG = LoggerFactory.getLogger(DynamicDataSourceHolder.class);

    private static ThreadLocal<String> contextHolder = new ThreadLocal<String>();
    public static final String DB_MASTER = "master";
    public static final String DB_SLAVE = "slave";

    public static String getDbType() {
        String db = contextHolder.get();
        if (db == null)
            db = DB_MASTER;
        if (LOG.isInfoEnabled())
            LOG.info("当前所使用的数据源为：" + db);
        return db;
    }

    public static void setDbType(String datasource) {
        contextHolder.set(datasource);
    }

    public static void clearDbType() {
        contextHolder.remove();
    }

    public static boolean isMaster() {
        return DB_MASTER.equals(getDbType());
    }

}
