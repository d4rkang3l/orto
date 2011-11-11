package jp.orto.sampleboard;

import java.io.*;

/**
 * �P�v���O�����̏��
 */
public class SampleInfo implements Serializable {
	// �ȉ��T�͕\���p
	private String imgIcon;
	private String programName;
	private String registerDay;
	private String updateDay;
	private String explain;
	// �u�N���v��URL
	private String launchUrl;
	// �\�[�X���̈ꗗ�iSourceInfo��Vector�j
	private SourceInfo[] sourceVec;

	public String getLaunchUrl() {
		return launchUrl;
	}

	public SourceInfo[] getSourceVec() {
		return sourceVec;
	}

	public SampleInfo(String imgIcon, String programName, String registerDay, String updateDay,
					  String explain, String launchUrl, SourceInfo[] sourceVec) {
		this.imgIcon = imgIcon;
		this.programName = programName;
		this.registerDay = registerDay;
		this.updateDay = updateDay;
		this.explain = explain;
		this.launchUrl = launchUrl;
		this.sourceVec = sourceVec;
	}
}
