package cn.richinfo.frame.util;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * author : Pan
 * time   : 2017/5/10
 * desc   : xxxx描述
 * version: 1.0
 * <p>
 * Copyright: Copyright (c) 2017
 * Company:深圳彩讯科技有限公司
 */

public final class TimeConstants {
    /**
     * 毫秒与毫秒的倍数
     */
    public static final int MSEC = 1;
    /**
     * 秒与毫秒的倍数
     */
    public static final int SEC  = 1000;
    /**
     * 分与毫秒的倍数
     */
    public static final int MIN  = 60000;
    /**
     * 时与毫秒的倍数
     */
    public static final int HOUR = 3600000;
    /**
     * 天与毫秒的倍数
     */
    public static final int DAY  = 86400000;

    @IntDef({MSEC, SEC, MIN, HOUR, DAY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Unit {
    }
}
