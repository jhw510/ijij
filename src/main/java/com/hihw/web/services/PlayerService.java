package com.hihw.web.services;

import com.hihw.web.domains.PlayerDTO;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface PlayerService {
    public List<PlayerDTO> retrieveAll();

   public List<PlayerDTO> retrieve();
}
