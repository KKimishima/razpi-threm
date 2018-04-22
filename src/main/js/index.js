import "../../../node_modules/bootstrap/dist/css/bootstrap.min.css"
import jQuery from "jquery";
import "bootstrap"
import "popper.js"
import "./common.css"
import {lasttempo} from "./init-last-temp";
import {all_data} from "./all-temp-data";
import {last_t_tempo} from "./init-last-temp";
import {delete_date} from "./delete-data";

const $ = jQuery;

// 2分ごとの読み込み
function load_temp() {
  $(() => {
    setInterval(() => {
      console.log("定期読み込み");
      lasttempo($("#last-temp"),$("#all-temp"));
      last_t_tempo($("#all-temp"),$("#error-msg"));
    }, 70000)
  });
}

// var temp = $("#last-temp");
// 初回読み込み
$(document).ready(() =>{
  console.log("初回読み込み");
  lasttempo($("#last-temp"));
  all_data($("#all-temp"),$("#error-msg"));
  load_temp()
  delete_date()
});

