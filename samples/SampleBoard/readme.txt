SampleBoard �̃C���X�g�[�����@

===============================================================================

���s����ɂ́A�ȉ��̂��̂��K�v�ł��B
�P�DJava2 SDK 1.4�i1.3 �ł͓����܂���j
�Q�D�T�[�u���b�g�G���W��
�@�@�@Tomcat 4.0, Resin 2.1 �œ�����m�F���Ă��܂��B

�C���X�g�[������ɂ́ASampleBoard.war ��K�؂ȃt�H���_�ɃR�s�[���A
�T�[�u���b�g�G���W�����ċN�����Ă��������B

Tomcat 4.0 �� Resin 2.1 �� �C���X�g�[����� webapps �t�H���_�ɃR�s�[�����OK�ł��B

http://localhost:8080/SampleBoard/SampleBoard.html
���J���΁A���s�ł��܂��B

Apache �ƘA�g���Ă���ꍇ�́A/SampleBoard �ȉ���
�T�[�u���b�g�ɂ܂킷�ݒ�����Ă��������B

  Resin 2.1 �̏ꍇ�́A
    <Location /SampleBoard/*>
      SetHandler caucho-request
    </Location>
  �� Apache �� conf/httpd.conf �ɒǉ����Ă��������B

�@Tomcat 4.0 �̕��@�͖��m�F�ł��B

================================================================================

�R���p�C���ς݂̂��t�����Ă��܂����A�\�[�X����R���p�C������ɂ́A
�@ant ( http://jakarta.apache.org/ant/ )
������ɕK�v�ł��Bant �̓R���p�C�����ɗ��p����֗��ȃc�[���ł��B

ant �́Ahttp://www.ingrid.org/jajakarta/ant/ �ɂē��{��󂪓ǂ߂܂��B
�܂��Ahttp://jakarta.apache.org/builds/jakarta-ant/release/ ����
�ŐV�ł��_�E�����[�h�ł��܂��B

�N���C�A���g�����R���p�C������ɂ́A
���� readme.txt ������t�H���_�ŁA�R�}���h���C������ ant �����s���Ă��������B
build.xml �����s����ASampleBoard.html ������܂��B

�T�[�o�[�����R���p�C�����āASampleBoard.war ���쐬����ɂ́A
servlet �t�H���_�Ɉړ����āAant �����s���Ă��������B

===============================================================================

�ӎ��F
http://roko.lolipop.jp/�@�@�t���[�f�ށ@�q�������@����
http://www.tiara.cc/~1999love/r_s/�@�@Rocket & Submarine�@����
����f�ނ𗘗p�����Ă��������܂����B

���肪�Ƃ��������܂��B
