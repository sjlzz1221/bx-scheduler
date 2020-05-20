package org.bx.scheduler.common.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class RegisterInfo {
    private String host;
    private int port;
    private List<TaskInfo> taskInfoListList;
}
