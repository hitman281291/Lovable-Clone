package com.springboot.project.lovable_clone.services;

import com.springboot.project.lovable_clone.dto.member.InviteMemberRequest;
import com.springboot.project.lovable_clone.dto.member.MemberResponse;

import java.util.List;

public interface ProjectMemberService {

    List<MemberResponse> getProjectMembers(Long projectId, Long userId);

    MemberResponse inviteMember(Long projectId, Long userId, InviteMemberRequest request);

    MemberResponse updateMemberRole(Long projectId, Long memberId, MemberResponse request, Long userId);

    MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userId);
}
