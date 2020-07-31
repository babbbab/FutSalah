package ido.arduino.service;

import java.util.List;

import ido.arduino.dto.LocationDto;
import ido.arduino.dto.MyTeamDto;
import ido.arduino.dto.TeamInfoDto;
import ido.arduino.dto.TeamInfoSimpleDto;

public interface TeamInfoService {

	int insert(TeamInfoDto info);

	int update(TeamInfoDto info);

	int delete(String teamID);

	List<TeamInfoSimpleDto> selectAll(); // 팀찾기에서 간단한 항목

	List<MyTeamDto> selectAllmyteam(); // 나의 팀 목록

	List<LocationDto> selectSido() throws Exception;// 서울,,,
}