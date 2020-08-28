package com.codecool.employees;

import com.codecool.utilities.GroupType;

import java.util.ArrayList;
import java.util.List;

public class WorkGroup {
    private GroupLead assignedLeader;
    private GroupType groupType;
    private List<Employee> members = new ArrayList<>();
    private final String groupName;

    public WorkGroup(GroupLead assignedLeader, GroupType groupType, String groupName) {
        this.assignedLeader = assignedLeader;
        this.groupType = groupType;
        this.groupName = groupName;

        members.add(assignedLeader);
        assignedLeader.setAssignedToWorkGroup(true);
    }

    public String getGroupName() {
        return groupName;
    }

    public void addMember(Employee employee) {
        members.add(employee);
        employee.setAssignedToWorkGroup(true);
    }

    public List<Employee> getMembers() {
        return members;
    }

    public int getMembersNr() {
        // we don't count the group leader
        return members.size() - 1;
    }
}
