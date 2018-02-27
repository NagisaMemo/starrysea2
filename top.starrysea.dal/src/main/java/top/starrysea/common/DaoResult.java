package top.starrysea.common;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import top.starrysea.kql.entity.Entity;

import static top.starrysea.common.ResultKey.*;

public class DaoResult {

	private boolean successed;
	private Map<ResultKey, Object> theResult;
	private String errInfo;

	public DaoResult() {}
	public DaoResult(boolean successed) {
		this.successed = successed;
	}

	public DaoResult(boolean successed, Map<?,?> result) {
		theResult = new HashMap<>();
		this.successed = successed;
		this.theResult.put(MAP, result);
	}
	
	public DaoResult(boolean successed, List<?> result) {
		theResult = new HashMap<>();
		this.successed = successed;
		this.theResult.put(LIST_1, result);
	}

	public DaoResult(boolean successed, Entity result) {
		theResult = new HashMap<>();
		this.successed = successed;
		this.theResult.put(ENTITY, result);
	}

	public DaoResult(boolean successed, Integer result) {
		theResult = new HashMap<>();
		this.successed = successed;
		this.theResult.put(INTEGER, result);
	}
	
	public DaoResult(boolean successed, boolean result) {
		theResult = new HashMap<>();
		this.successed = successed;
		this.theResult.put(BOOLEAN, result);
	}

	public DaoResult(boolean result, String errInfo) {
		this.successed = result;
		this.errInfo = errInfo;
	}

	public boolean isSuccessed() {
		return successed;
	}

	public void setSuccessed(boolean successed) {
		this.successed = successed;
	}

	public String getErrInfo() {
		return errInfo;
	}

	public void setErrInfo(String errInfo) {
		this.errInfo = errInfo;
	}

	public Map<ResultKey, Object> getTheResult() {
		return theResult;
	}

	@SuppressWarnings("unchecked")
	public <T> T getResult(ResultKey resultKey) {
		return (T) resultKey.getClazz().cast(theResult.get(resultKey));
	}

}
