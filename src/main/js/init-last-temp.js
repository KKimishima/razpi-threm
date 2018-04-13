import jQuery from "jquery";

const $ = jQuery;

export function lasttempo(show_temp) {

  $.ajax({
    url: "/api/v1/temp/last",
    type: "GET",
    dataType: "json"
  }).done((result) => {
    let data = result[0];
    show_temp.text(data["temp"] + "℃");
  }).fail(() => {
    show_temp.text("サーバエラー");
  })
}

export function last_t_tempo(show_t_temp,err) {
  $.ajax({
    url: "/api/v1/temp/last",
    type: "GET",
    dataType: "json"
  }).done((result) => {
    let data = result[0];
    show_t_temp.append(`<tr><td>${data["no"]}</td><td>${data["datetime"]}</td><td>${data["temp"]}</td></tr>`);
  }).fail(() => {
    err.html(`
      <div class="alert alert-danger" role="alert">
        <strong>読み込み失敗</strong> サーバに接続できません
      </div>`)
  })
}