package com.example.UploadDownload.enities.DTO;

import com.example.UploadDownload.enities.User;

public class DownloadUserProfilePictureDTO {
    private User user;
    private byte[] profilePicture;

    public DownloadUserProfilePictureDTO(User user, byte[] profilePicture) {
        this.user = user;
        this.profilePicture = profilePicture;
    }

    public DownloadUserProfilePictureDTO() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public byte[] getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(byte[] profilePicture) {
        this.profilePicture = profilePicture;
    }
}