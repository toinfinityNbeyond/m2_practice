package org.zerock.m2.service;

import lombok.extern.log4j.Log4j2;
import org.zerock.m2.dao.MemberDAO;
import org.zerock.m2.dto.MemberDTO;

@Log4j2
public enum MemberService {
    INSTANCE;

    public MemberDTO login(String mid, String mpw) throws RuntimeException {
        return MemberDAO.INSTANCE.selectByForLogin(mid, mpw);
    }
}
