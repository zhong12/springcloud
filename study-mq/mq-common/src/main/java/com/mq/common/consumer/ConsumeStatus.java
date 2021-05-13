package com.mq.common.consumer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

/**
 * @Author: zj
 * @Date: 2021/4/30 14:29
 * @Description:
 * @Version: 1.0
 */
public enum ConsumeStatus {
    CONSUME_SUCCESS,

    /**
     * Failure consumption,later try to consume
     */
    RECONSUME_LATER;
}
