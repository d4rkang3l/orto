package jp.orto.sampleboard;

import orto.servlet.*;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class GetData extends HttpServlet {
	private static SampleInfo[] vec;

	final static String[] mtSrc = {
		"client/jp/orto/monkeytiger/MonkeyTiger.java"};
	final static String[] pbSrc = {
		"client/jp/orto/sampleboard/SampleBoard.java",
		"client/jp/orto/sampleboard/SampleInfo.java",
		"client/jp/orto/sampleboard/SourceInfo.java",
		"servlet/jp/orto/sampleboard/GetData.java",
		"servlet/jp/orto/sampleboard/GetSource.java",
		"servlet/jp/orto/sampleboard/SampleInfo.java",
		"servlet/jp/orto/sampleboard/SourceInfo.java"};

	static {
		vec = new SampleInfo[2];

		// �T���g���Z�̃f�[�^�x�[�X�쐬
		SourceInfo[] sourceVec = { new SourceInfo(mtSrc[0], mtSrc[0]) };
		vec[0] = new SampleInfo(
				"monkey.gif", "�T���g���Z", "2002/10/14", "2002/10/14",
				"���킢���T���ƃg�������Ȃ��̂��߂Ɍv�Z�����Ă���܂��B",
				"http://orto.jp/samples/MonkeyTiger/MonkeyTiger.html",
				sourceVec);

		// �v���O�����f���̃f�[�^�x�[�X�쐬
		sourceVec = new SourceInfo[pbSrc.length];
		for (int i = 0; i < pbSrc.length; i++)
			sourceVec[i] = new SourceInfo(pbSrc[i], pbSrc[i]);
		vec[1] = new SampleInfo(
				"snowflake-bbs-b.gif", "�v���O�����f����", "2002/11/11", "2002/11/11",
				"����̂��Ƃł��B", "http://orto.jp/SampleBoard/SampleBoard.html",
				sourceVec);
	}

	/**
	 * �v���O�����ꗗ���o�͂��܂��B
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HTMLOutputStream out = new HTMLOutputStream(response);
		out.writeObject(vec);
		out.send();
	}
}
