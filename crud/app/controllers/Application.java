package controllers;

import java.sql.Timestamp;
import java.util.Date;

import models.SxData;
import cn.bran.play.JapidController;

public class Application extends JapidController {

    public static void index() {
        renderJapid(SxData.findAll());
    }
    
    public static void formPage(Integer pageType, Integer id) {
    	SxData d = id!=null ? SxData.findById(id) : new SxData();
    	renderJapid(pageType, d);
    }
    
    public static void save(SxData d) {
    	if(d.id == null) {
    		d.createTime = new Timestamp(new Date().getTime());
    	}
    	d.save();
    	index();
    }
    
    public static void delete(Integer id) {
    	SxData.delete("id=?", id);
    	index();
    }

}