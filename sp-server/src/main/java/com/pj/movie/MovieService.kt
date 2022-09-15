package com.pj.movie

import com.pj.project4sp.SP
import com.pj.utils.so.SoMap
import org.springframework.stereotype.Service

@Service
class MovieService {

    fun findByPage(id: Number = 0, pageSize: Int = 5, order: String = "asc"): MutableList<SoMap> {
        return SP.publicMapper.getPageListMapById("sp_role_permission", id, "<", order, pageSize)
    }
}