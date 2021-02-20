<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link href="player.css" rel="stylesheet" />
    <script src="jquery-1.10.2.min.js"></script>
    
</head>

<body>
    <div id="bg">
        <div id="blackLayer"></div>
        <img src="img/Poster1.jpg" />
    </div>

    <div id="main">
        <div id="image">
            <img src="img/Poster1.jpg" />
        </div>
        <div id="player">
            <div id="songTitle">Demo</div>
            <div id="buttons">
                <button id="pre" onclick="pre()"><img src="img/Pre.png" height="90%" width="90%" /></button>
                <button id="play" onclick="playOrPauseSong()"><img src="img/Pause.png" /></button>
                <button id="next" onclick="next()"><img src="img/Next.png" height="90%" width="90%" /></button>
            </div>

            <div id="seek-bar">
                <div id="fill"></div>
                <div id="handle"></div>
            </div>
        </div>
    </div>
</body>
<script type="text/javascript">
    var songs = ["Song1.mp3", "Song1.mp3", "Song1.mp3"];
    var poster = ["img/Poster1.jpg", "img/Poster2.jpg", "img/Poster3.jpg"];

    var songTitle = document.getElementById("songTitle");
    var fillBar = document.getElementById("fill");

    var song = new Audio();
    var currentSong = 0; // it point to the current song

    window.onload = playSong; // it will call the function playSong when window is load
    function playSong() {
        song.src = songs[currentSong]; //set the source of 0th song 
        songTitle.textContent = songs[currentSong]; // set the title of song
        song.play(); // play the song
    }

    function playOrPauseSong() {
        if (song.paused) {
            song.play();
            $("#play img").attr("src", "img/Pause.png");
        } else {
            song.pause();
            $("#play img").attr("src", "img/Play.png");
        }
    }

    song.addEventListener('timeupdate', function () {
        var position = song.currentTime / song.duration;
        fillBar.style.width = position * 100 + '%';
    });


    function next() {
        currentSong++;
        if (currentSong > 2) {
            currentSong = 0;
        }
        playSong();
        $("#play img").attr("src", "img/Pause.png");
        $("#image img").attr("src", poster[currentSong]);
        $("#bg img").attr("src", poster[currentSong]);
    }

    function pre() {
        currentSong--;
        if (currentSong < 0) {
            currentSong = 2;
        }
        playSong();
        $("#play img").attr("src", "img/Pause.png");
        $("#image img").attr("src", poster[currentSong]);
        $("#bg img").attr("src", poster[currentSong]); 
    }
</script>
</html>
