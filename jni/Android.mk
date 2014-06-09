LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := voice-native
LOCAL_SRC_FILES := voice-native.cpp

include $(BUILD_SHARED_LIBRARY)
