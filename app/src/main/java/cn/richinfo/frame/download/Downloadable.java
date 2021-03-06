package cn.richinfo.frame.download;

/**
 * Description: 下载能力接口 <br>
 * Copyright: Copyright (c) 2017 <br>
 * Company:深圳彩讯科技有限公司 <br>
 * Email:284425176@qq.com <br>
 *
 * @author suma on 2017/5/26
 * @version 1.0
 */

public interface Downloadable {

    void download(Request request);

    void cancel(Request request);

}
