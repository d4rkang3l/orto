Orto JavaScript-based JVM
=========================

Orto is an implementation of the Java Virtual Machine implemented in JavaScript. 

I'm not the original author of Orto, I just noticed that it had disappeared from the web, and had a local copy. The license file is gibberish but the HTML page mentions that Orto is "free," so I'm assuming that means it's okay to share and learn from, but without the actual license file it's unclear if you're allowed to use this in your own projects. (If anyone has a non-gibberish copy of the license file, please send a pull request.)


More about Orto: http://ejohn.org/blog/running-java-in-javascript/



Summary
=======

(Translated by Google)

Orto is

 - Class file
 - VM (Virtual Machine)
 - Resource file. Class.getResourceAsStream (String) used in the.

 Combine to produce a single HTML file.

How to use
----------

	java -jar orto.jar [options] pathNames...

 Add the following recursive folder you specify a folder name pathName.

Option
------

<body>
<table cellspacing="0" cellpadding="0" class="t1">
  <tbody>
    <tr>
      <td valign="middle" class="td1">
        <p class="p1"><b>Argument</b></p>
      </td>
      <td valign="middle" class="td2">
        <p class="p1"><b>Description</b></p>
      </td>
    </tr>
    <tr>
      <td valign="top" class="td3">
        <p class="p2">- The main class name</p>
      </td>
      <td valign="middle" class="td4">
        <p class="p2"><span class="s1">[Mandatory]</span> Specifies the class to be run first.</p>
      </td>
    </tr>
    <tr>
      <td valign="top" class="td3">
        <p class="p2">MainHTML HTML file-name</p>
      </td>
      <td valign="middle" class="td4">
        <p class="p2">Specifies the HTML file to load at startup in advance.<span class="Apple-converted-space"> </span></p>
        <p class="p2">This file is an HTML file that specifies the main design.<span class="Apple-converted-space"> </span></p>
        <p class="p2">For actual use, please read the tutorial.</p>
      </td>
    </tr>
    <tr>
      <td valign="top" class="td3">
        <p class="p2">-Compress</p>
      </td>
      <td valign="middle" class="td4">
        <p class="p2">Generate a compressed HTML. Two times slower start.<span class="Apple-converted-space"> </span></p>
        <p class="p2">Orto is built on the assumption that the Web server in conjunction with gzip compression.<span class="Apple-converted-space"> </span></p>
        <p class="p2">Please use as a last resort if you absolutely can not enable gzip compression.<span class="Apple-converted-space"> </span></p>
        <p class="p2">is equal to 1 / 4 compression that gzip, is about 1 / 3 and applying compression Ortoar.</p>
      </td>
    </tr>
    <tr>
      <td valign="top" class="td3">
        <p class="p2">Language-language</p>
      </td>
      <td valign="middle" class="td4">
        <p class="p2">Please specify the language. Japanese is ja, English is en.</p>
      </td>
    </tr>
    <tr>
      <td valign="top" class="td3">
        <p class="p2">-Encoding encoding name</p>
      </td>
      <td valign="middle" class="td4">
        <p class="p2">Please specify the encoding, such as Shift_JIS.</p>
      </td>
    </tr>
    <tr>
      <td valign="top" class="td3">
        <p class="p2">-ScriptEmbedded</p>
      </td>
      <td valign="middle" class="td4">
        <p class="p2">Combine embed the JavaScript and HTML JavaScript.</p>
      </td>
    </tr>
    <tr>
      <td valign="top" class="td3">
        <p class="p2">OutputHTML file-name</p>
      </td>
      <td valign="middle" class="td4">
        <p class="p2">Create an HTML file with the specified file name.<span class="Apple-converted-space"> </span></p>
        <p class="p2">- Determine if you have not specified a file name generated from the class name in the main.</p>
      </td>
    </tr>
    <tr>
      <td valign="top" class="td3">
        <p class="p2">OutputScript file-name</p>
      </td>
      <td valign="middle" class="td4">
        <p class="p2">Create an external JavaScript file specified by filename.<span class="Apple-converted-space"> </span></p>
        <p class="p2">- Determine if you have not specified a file name generated from the class name in the main.</p>
      </td>
    </tr>
    <tr>
      <td valign="top" class="td3">
        <p class="p2">-Version</p>
      </td>
      <td valign="middle" class="td4">
        <p class="p2">Displays the version of the Orto.</p>
      </td>
    </tr>
  </tbody>
</table>

For deployment to a server
--------------------------

Simply upload the HTML file generated by the Web server Orto, Orto application is available, we strongly recommend that you enable gzip compression for the Web server. Orto is built on the assumption that compression is enabled gzip. If you include the Apache, include the mod_gzip, please make the necessary settings. For Microsoft IIS, you have the option to enable compression gzip.

ISP (provider) services such as home advantage, really, if you can not enable gzip compression to compress option with Orto-please. Starting to generate a compressed HTML will be slower.

Example
-------

If the class runs MonkeyTiger.class. Generate a MonkeyTiger.html.

	java -jar ortoar.jar-main MonkeyTiger MonkeyTiger.class
