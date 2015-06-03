package com.vcloudairshare.client.event;

import com.google.gwt.event.shared.GwtEvent;

public class LoginEvent extends GwtEvent<LoginEventHandler> {

    public static Type<LoginEventHandler> TYPE = new Type<LoginEventHandler>();


    public LoginEvent() {
    }

    @Override
    public Type<LoginEventHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(LoginEventHandler handler) {
        handler.onMessageReceived(this);
    }
}