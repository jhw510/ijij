package com.hihw.web.domains;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component


@Getter @Setter
public class PlayerDTO {
    public String playerId,playerName,ePlayerName,nickName,joinYyyy
            ,position,backNo,nation,birthDate,solar,height,weight,teamId;
}

