package org.zerock.m2.service;

import lombok.extern.log4j.Log4j2;
import org.zerock.m2.dao.MsgDAO;
import org.zerock.m2.dto.MsgDTO;

import java.util.List;
import java.util.Map;


@Log4j2
public enum MsgService {  //서비스 계층은 고객의 요구사항을 반영.

    INSTANCE;


    public void remove(Long mno, String who) throws RuntimeException {

        log.info("Service remove......." +  mno, who);
        MsgDAO.INSTANCE.delete(mno, who);
    }

    public void register(MsgDTO msgDTO) throws RuntimeException {

        log.info("service register......" + msgDTO);

        MsgDAO.INSTANCE.insert(msgDTO);

    }

    public MsgDTO read(Long mno) throws RuntimeException {
        return MsgDAO.INSTANCE.select(mno);
    }



    public Map<String, List<MsgDTO>> getList(String user) throws RuntimeException { //자신 없음 런타임~~
        long start = System.currentTimeMillis();

    Map<String, List<MsgDTO>> result = MsgDAO.INSTANCE.selectList(user);

    long end = System.currentTimeMillis();  //스탑워치

    log.info("TIME: " + (end - start));

    return  result;

    }


}
