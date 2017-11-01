package com.cognizant.booking.mapper;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseMapper {

    @Autowired
    private DozerBeanMapper dozerBeanMapper;

    public <T,U> U tryMapping(final T src, final Class<U> dest) {
        return dozerBeanMapper.map(src, dest);
    }

    public <T,U> void tryMapping(final T src, final U dest) {
        dozerBeanMapper.map(src, dest);
    }
}
