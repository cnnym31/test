for(var i = 1; i <= 5; i++){
   document.write("★"); 
}

document.write("<br>");
document.write("<br>");

for(var i = 1; i <= 6; i++){
    if(i == 4){
        document.write("<br>");
    }
    document.write("★");
}

document.write("<br>");
document.write("<br>");

for (var i = 1; i <= 10; i++){
    if(i == 6){
        document.write("<br>");
    }
    document.write("☆");
}

document.write("<br>");
document.write("<br>");

for(var i = 1; i <= 20; i++){
    if(i % 5 == 0){
        document.write("★" + "<br>");
    } else {
        document.write("★") ;  
    }
}

document.write("<br>");
document.write("<br>");

for(var i = 1; i <= 12; i++){
    if(i % 3 === 0){
        document.write("★" + "<br>");
    } else {
        document.write("★");
    }
}

document.write("<br>");
document.write("<br>");

for(var i = 1; i <= 3; i++){
    for (var a = 1 ; a <= 3; a++){
        if(a % 2 === 0){
            document.write("☆");
        } else {
            document.write("★");
        }
    }
    document.write("<br>");
}

document.write("<br>");
document.write("<br>");

for(var i = 1; i <= 4; i++){
    for (var a = 1; a <= 5; a++){
        if(a % 2 === 0){
            document.write("☆");
        } else {
            document.write("★");
        }
    }
    document.write("<br>");
}

document.write("<br>");
document.write("<br>");

for(var i = 1; i <= 5; i++){
    for(var a = 1; a <= i; a++){
        document.write("★");
    }
    document.write("<br>");
}

document.write("<br>");
document.write("<br>");

function menseki(hankei){
    return hankei * hankei * 3.14;
}

document.write(menseki(5) + "<br>");
document.write(menseki(7) + "<br>");
document.write(menseki(10) + "<br>");

document.write("<br>");
document.write("<br>");

function total(group,adult, kids){
    return group + "グループの合計金額は" + (adult * 500 + kids * 200) + "円です";
}

document.write(total("A",2,4) + "<br>");
document.write(total("B",1,5) + "<br>");
document.write(total("C",3,7) + "<br>");

document.write("<br>");
document.write("<br>");

for(var i = 1; i <= 5; i++){
    for(var a = 1; a <= 5; a++){
        document.write("★");
    }
    document.write("<br>")
}

document.write("<br>");
document.write("<br>");

for(var i = 1; i <= 5; i++){
    if (i % 2 == 0){
        for(var a =1; a <= 5; a++){
            if (a % 2 == 0){
                document.write("★");
            } else {
                document.write("☆");
            }
        }
    } else {
        for (var b = 1; b <= 5; b++){
            if (b % 2 == 0){
                document.write("☆");
            } else {
                document.write("★");
            }
        }
    }
    document.write("<br>");
}

document.write("<br>");
document.write("<br>");

for (var i = 1; i <= 5; i++){
    for(var a = 1; a <= 5; a++){
        if(a == i){
            document.write("☆");
        } else {
            document.write("★");
        }
    }
    document.write("<br>");
}

document.write("<br>");
document.write("<br>");

for(var i = 1; i <= 5; i++){
    for(var a = 1; a <= i; a++){
        document.write("★");
    }
    document.write("<br>");
}

document.write("<br>");
document.write("<br>");

for(var i = 1; i <= 5; i++){
    for(var a = 1; a <= 5; a++){
        if(a == i){
            document.write("☆");
            break;
        } else {
            document.write("★");
        }
    }
    document.write("<br>");
}

