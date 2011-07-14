package corepharma.tools;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

public final class UserSessionInfos {
	
	public static Integer getUserIdSession()
	{
		Map session;
		session = ActionContext.getContext().getSession();
		Integer userId = (Integer) session.get("userId");
		return userId;
	}
}