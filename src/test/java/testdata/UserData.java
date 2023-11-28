package testdata;

import model.UserModel;

public class UserData {

    public static UserModel validUser(){
        return new UserModel( "usuarioX", "senhaY" );
    }
}
