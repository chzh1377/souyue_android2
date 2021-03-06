package com.tuita.sdk.im.db.module;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 

import java.io.Serializable;
import com.zhongsou.souyue.DontObfuscateInterface;

/**
 * Entity mapped to table GROUP_MEMBERS.
 */
public class GroupMembers implements Serializable,DontObfuscateInterface {

    private Long id;
    private long group_id;
    private long member_id;
    private String nick_name;
    private String member_avatar;
    private String member_name;
    private long self_id;
    private int is_owner;
    private String by1;
    private String by2;
    private String localOrder;
    private String localOrderHighLight;
    private String conmmentName = "";

    public GroupMembers() {
    }

    public GroupMembers(Long id) {
        this.id = id;
    }

    public GroupMembers(Long id, long group_id, long member_id, String nick_name, String member_avatar, String member_name, long self_id, int is_owner, String by1, String by2) {
        this.id = id;
        this.group_id = group_id;
        this.member_id = member_id;
        this.nick_name = nick_name;
        this.member_avatar = member_avatar;
        this.member_name = member_name;
        this.self_id = self_id;
        this.is_owner = is_owner;
        this.by1 = by1;
        this.by2 = by2;
    }
    public String getLocalOrderHighLight() {
        return localOrderHighLight;
    }

    public void setLocalOrderHighLight(String localOrderHighLight) {
        this.localOrderHighLight = localOrderHighLight;
    }
    public String getLocalOrder() {
        return localOrder;
    }

    public void setLocalOrder(String localOrder) {
        this.localOrder = localOrder;
    }

    public String getConmmentName() {
        return conmmentName;
    }

    public void setConmmentName(String conmmentName) {
        this.conmmentName = conmmentName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getGroup_id() {
        return group_id;
    }

    public void setGroup_id(long group_id) {
        this.group_id = group_id;
    }

    public long getMember_id() {
        return member_id;
    }

    public void setMember_id(long member_id) {
        this.member_id = member_id;
    }

    public String getNick_name() {
        return nick_name;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }

    public String getMember_avatar() {
        return member_avatar;
    }

    public void setMember_avatar(String member_avatar) {
        this.member_avatar = member_avatar;
    }

    public String getMember_name() {
        return member_name;
    }

    public void setMember_name(String member_name) {
        this.member_name = member_name;
    }

    public long getSelf_id() {
        return self_id;
    }

    public void setSelf_id(long self_id) {
        this.self_id = self_id;
    }

    public int getIs_owner() {
        return is_owner;
    }

    public void setIs_owner(int is_owner) {
        this.is_owner = is_owner;
    }

    public String getBy1() {
        return by1;
    }

    public void setBy1(String by1) {
        this.by1 = by1;
    }

    public String getBy2() {
        return by2;
    }

    public void setBy2(String by2) {
        this.by2 = by2;
    }

}
