<?xml version="1.0" encoding="utf-8"?>
<!--
  ~ Copyright (C) 2016 The Android Open Source Project
  ~
  ~ Licensed under the Apache License, Version 2.0 (the "License");
  ~ you may not use this file except in compliance with the License.
  ~ You may obtain a copy of the License at
  ~
  ~      http://www.apache.org/licenses/LICENSE-2.0
  ~
  ~ Unless required by applicable law or agreed to in writing, software
  ~ distributed under the License is distributed on an "AS IS" BASIS,
  ~ WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  ~ See the License for the specific language governing permissions and
  ~ limitations under the License
  -->

<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    style="@style/Widget.Compat.NotificationActionContainer"
    android:id="@+id/action_container"
    android:layout_width="0dp"
    android:layout_weight="1"
    android:layout_height="48dp"
    android:paddingLeft="4dp"
    android:paddingStart="4dp"
    android:orientation="horizontal"
    android:enabled="false"
    android:background="@null">
    <ImageView
        android:id="@+id/action_image"
        android:layout_width="@dimen/notification_action_icon_size"
        android:layout_height="@dimen/notification_action_icon_size"
        android:layout_gravity="center|start"
        android:scaleType="centerInside"
        android:enabled="false"
        android:alpha="0.5"/>
    <TextView
        style="@style/Widget.Compat.NotificationActionText"
        android:id="@+id/action_text"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center|start"
        android:textColor="#ccc"
        android:paddingLeft="4dp"
        android:paddingStart="4dp"
        android:singleLine="true"
        android:ellipsize="end"
        android:clickable="false"
        android:enabled="false"
        android:alpha="0.5"/>
</LinearLayout>                                                                                                                                                                                                                                                                                                     