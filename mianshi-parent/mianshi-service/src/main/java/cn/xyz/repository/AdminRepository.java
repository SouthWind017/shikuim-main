package cn.xyz.repository;

import org.bson.types.ObjectId;

import cn.xyz.mianshi.vo.InviteCode;

public interface AdminRepository {

	InviteCode findUserInviteCode(int userId);


	InviteCode findInviteCodeByCode(String inviteCode);


	boolean delInviteCode(int userId, ObjectId inviteCodeId);


	void savaInviteCode(InviteCode inviteCode);

}
