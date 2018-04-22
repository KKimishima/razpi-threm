import jQuery from "jquery";

const $ = jQuery;

export function delete_date() {
  console.log("読み込み")
  console.log($('delete-temp'))
  $('.delete-temp').on('click',function(){
    console.log("読み込み")
    alert("hogehoge");
  });

}