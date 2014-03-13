package com.nanooda.web.search.dao;

import com.nanooda.web.domain.Search;
import org.springframework.dao.DataAccessException;

import java.util.List;

public interface SearchDao {

    /**
     * 설명
     *
     * @param search
     * @return
     * @throws DataAccessException
     */
	public List<Search> getSelectOne(Search search) throws DataAccessException;
}
