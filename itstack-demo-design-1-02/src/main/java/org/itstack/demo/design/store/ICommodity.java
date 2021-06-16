package org.itstack.demo.design.store;

import java.util.Map;

/**
 * 定义发奖接口
 */
public interface ICommodity {

    /**
     * 用户ID、奖品ID、业务ID以及扩展字段用于处理发放实物商品时的收获地址。
     * @param uId
     * @param commodityId
     * @param bizId
     * @param extMap
     * @throws Exception
     */
    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;

}
