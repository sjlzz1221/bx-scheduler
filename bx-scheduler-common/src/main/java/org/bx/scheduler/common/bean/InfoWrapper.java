package org.bx.scheduler.common.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class InfoWrapper {
    private Object info;
    private String handler;
}
