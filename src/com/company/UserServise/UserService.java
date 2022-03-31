package com.company.UserServise;


import com.company.Models.UserModel;

public class UserService {
    public final static UserLogs userLogsService = new UserLogs ();
    public final static User userService = new UserService ();

    public boolean addUserAndLogs ( UserModel user )
    {
        if ( userService.addUser ( user ) )
        {
            return userLogsService.addUserLogs ( userService.getUserByName ( user.getUserName () ), "SUCCESS" );
        }
        return false;
    }

    public String logsUser ( String name, String pass )
    {
        UserModel user = userService.getUserByName ( name );
        System.out.println ( user );
        if ( user == null )
        {
            return "Invalid password or user_name";
        }
        if ( !user.isBlocked () )
        {
            if ( user.getPassword ().equals ( pass ) )
            {
                userLogsService.updateUserLogs ( user.getId (), "SUCCESS" );
                return "authorization was successful!!!";
            } else
            {
                userLogsService.updateUserLogs ( user.getId (), "FAIL" );
                if ( userLogsService.countLog ( user.getId () ) > 3 )
                {
                    userService.unlockingUser ( user, userLogsService.getUserLogsByUserID ( user.getId () ) );
                    return "You are blocked for 5 min";
                }
                return "Invalid password or user_name";
            }
        } else
        {
            return "NO";
        }
    }
}

