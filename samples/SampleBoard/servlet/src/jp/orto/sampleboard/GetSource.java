package jp.orto.sampleboard;

import orto.servlet.*;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class GetSource extends HttpServlet {
	/**
	 * �t�@�C�������󂯎��A�\�[�X��Ԃ��܂��B
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// �t�@�C������ǂݍ���
		HTMLInputStream in = new HTMLInputStream(request);
		String fileName = in.readUTF();
		in.close();

		// �t�@�C�������f�[�^�x�[�X�ɓ����Ă��邩�`�F�b�N����B
		boolean isRealFileName = false;
		if(GetData.mtSrc[0].equals(fileName))
			isRealFileName = true;
		for (int i = 0; i < GetData.pbSrc.length; i++) {
			if (GetData.pbSrc[i].equals(fileName))
				isRealFileName = true;
		}

		// �\�[�X�t�@�C����ǂݍ���
		String source = "";
		if (isRealFileName) {
			BufferedReader reader = new BufferedReader
					(new InputStreamReader(getServletContext().getResourceAsStream(fileName),
							"SJIS"));
			String line;
			while ((line = reader.readLine()) != null)
				source += line + "\n";
		}

		// �\�[�X�𑗐M����B
		HTMLOutputStream out = new HTMLOutputStream(response);
		out.writeUTF(source);
		out.send();
	}
}
