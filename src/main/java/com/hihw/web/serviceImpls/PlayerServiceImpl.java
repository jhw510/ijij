package com.hihw.web.serviceImpls;

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
    public List<PlayerDTO> retrieve() {
        return playerMapper.selectAll();
    }

    @Override
    public PlayerDTO findOne(String searchWord) {
        return playerMapper.selectOne(searchWord);
    }
    @Override
    public PlayerDTO login(PlayerDTO params) {
        return playerMapper.login(params);
    }
}