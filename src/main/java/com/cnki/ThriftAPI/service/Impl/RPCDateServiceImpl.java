package com.cnki.ThriftAPI.service.Impl;

import com.cnki.ThriftAPI.service.RPCDateService;
import org.apache.thrift.TException;
import org.springframework.stereotype.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;
@Controller
public class RPCDateServiceImpl implements RPCDateService.Iface {

    @Override
    public String getDate(String username) throws TException {
        Date now=new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("今天是"+"yyyy年MM月dd日 E kk点mm分");
        String nowTime = simpleDateFormat.format( now );
        return "Hello " + username + "\n" + nowTime +"\n";
    }

    @Override
    public String getName(String username) throws TException {
        String hello = "Hello "+username+ "\n" +"there is no time";
        return hello;
    }
}
