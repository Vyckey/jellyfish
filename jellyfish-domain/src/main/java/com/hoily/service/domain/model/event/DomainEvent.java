package com.hoily.service.domain.model.event;

import java.util.Date;

/**
 * Domain Event Interface
 *
 * @author vyckey
 * 2022/6/24 12:45
 */
public interface DomainEvent {
    Date occurredOn();
}
