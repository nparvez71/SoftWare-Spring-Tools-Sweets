package com.coderbd.controller;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coderbd.entity.core.CoreSettingGroup;
import com.coderbd.service.CoreSettingGroupService;

@ManagedBean
@Component(value = "coreSettingGroupMB")
@ViewScoped
public class CoreSettingGroupController {
	@Autowired
	private   CoreSettingGroupService   coreSettingGroupService;
	private  CoreSettingGroup bean;
	private   CoreSettingGroup beanSelected;
	private Iterable<  CoreSettingGroup> list;
	private Iterable<  CoreSettingGroup> listSelected;
	
	
	@PostConstruct
	public void init() {
		refreshList();
	}
	public void refreshList() {
		this.bean = new CoreSettingGroup();
		this.beanSelected = new CoreSettingGroup();
		this.list = new ArrayList<CoreSettingGroup>();
		this.listSelected = new ArrayList<CoreSettingGroup>();
		try {
			list=coreSettingGroupService.findAll();
			listSelected=list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public String insert() {
		System.out.println("Sami............"+bean.getGroupName());
		try {
			if (bean != null) {
				coreSettingGroupService.create(bean);
				reset();
				refreshList();
			}
			notificationSuccess("Insert Success!!!");
		} catch (Exception e) {
			notificationError(e, "Something Wrong !!!");
			e.printStackTrace();
		}
		return null;

	}
	public String update() {
		try {
			if (beanSelected != null) {
				coreSettingGroupService.update(beanSelected);
				refreshList();
			}
			notificationSuccess("Update Success!!!");
		} catch (Exception e) {
			notificationError(e, "Something Wrong !!!");
			e.printStackTrace();
		}
		return null;

	}
	
	
	public String delete() {
		try {
			if (beanSelected != null) {
				coreSettingGroupService.delete(beanSelected);
				refreshList();
			}
			notificationSuccess("Delete Success!!!");
		} catch (Exception e) {
			notificationError(e, "Something Wrong !!!");
			e.printStackTrace();
		}
		return null;

	}
	
	
	public CoreSettingGroup getBean() {
		if(bean == null ) {
			bean=new CoreSettingGroup();
		}
		return bean;
	}
	public void setBean(CoreSettingGroup bean) {
		this.bean = bean;
	}
	public CoreSettingGroup getBeanSelected() {
		if(beanSelected == null ) {
			beanSelected =new CoreSettingGroup();
		}
		return beanSelected;
	}

	public void setBeanSelected(CoreSettingGroup beanSelected) {
		this.beanSelected = beanSelected;
	}

	public Iterable<CoreSettingGroup> getList() {
		
		return list;
	}

	public void setList(Iterable<CoreSettingGroup> list) {
		this.list = list;
	}

	public Iterable<CoreSettingGroup> getListSelected() {
		return listSelected;
	}

	public void setListSelected(Iterable<CoreSettingGroup> listSelected) {
		this.listSelected = listSelected;
	}

	public void reset() {

		RequestContext.getCurrentInstance().reset("form1:panel");
	}

	public void notificationSuccess(String operation) {
		FacesMessage msg = null;
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO, operation, "Success");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void notificationError(Exception e, String operation) {
		FacesMessage msg = null;
		msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, operation, "Error");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	
	
	
	
}