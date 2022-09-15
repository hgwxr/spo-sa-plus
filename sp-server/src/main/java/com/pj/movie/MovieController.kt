package com.pj.movie

import cn.dev33.satoken.annotation.SaCheckPermission
import com.pj.current.satoken.AuthConst
import com.pj.project4sp.admin.SpAdmin
import com.pj.utils.LogUtil
import com.pj.utils.sg.AjaxJson
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/movie/")
class MovieController {
    @Autowired
    lateinit var movieService: MovieService

    /** 增   */
    @RequestMapping("/list/{id}")
    fun findByPage(@PathVariable("id")id: Int = 0): AjaxJson? {
        LogUtil.info("findByPage:id :$id")
        return AjaxJson.getSuccessData(movieService.findByPage(id = id))
    }
}