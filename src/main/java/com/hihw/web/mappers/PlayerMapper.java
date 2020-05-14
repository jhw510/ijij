package com.hihw.web.mappers;

import com.hihw.web.domains.PlayerDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerMapper {
   public List<PlayerDTO> selectAll();

}
