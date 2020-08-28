package com.codecool.employees;

import com.codecool.utilities.GroupType;

import java.util.List;

public class WorkGroup {
    private GroupLead assignedLeader;
    private GroupType groupType;
    private List<Employee> members;
    private final String groupName;

    public WorkGroup(GroupLead assignedLeader, GroupType groupType, String groupName) {
        this.assignedLeader = assignedLeader;
        this.groupType = groupType;
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void addMember(Employee employee) {
        members.add(employee);
    }
}
