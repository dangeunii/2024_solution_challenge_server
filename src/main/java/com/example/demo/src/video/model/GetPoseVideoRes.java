package com.example.demo.src.video.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetPoseVideoRes {
    private int poseIdx;
    private String poseName;
    private String url;
}

