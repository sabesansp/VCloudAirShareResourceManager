package com.vcloudairshare.client.event;

import com.google.gwt.event.shared.EventHandler;
  public interface ErrorEventHandler extends EventHandler {
    void onMessageReceived(ErrorEvent event);
}