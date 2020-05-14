package com.hihw.web.serviceImpl;

import com.hihw.web.domains.PlayerDTO;
import com.hihw.web.mappers.PlayerMapper;
import com.hihw.web.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {
    @Autowired PlayerMapper playerMapper;
    @Override
    public List<PlayerDTO> retrieveAll() {
        return playerMapper.selectAll();
    }
}