package me.tomasan7.here

import java.util.*

class Group(id: UUID)
{
    val _members: MutableMap<UUID, Member> = mutableMapOf()
    val members: Set<Member>
        get() = _members.values.toSet()

    fun addMember(member: Member)
    {
        _members[member.id] = member
    }

    fun removeMemberById(memberId: UUID)
    {
        _members.remove(memberId)
    }

    fun getMemberById(memberId: UUID): Member?
    {
        return _members[memberId]
    }
}
