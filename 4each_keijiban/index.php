<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>掲示板</title>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>

<body>
    
    <?php
    
    mb_internal_encoding("utf8");
    $pdo = new PDO("mysql:dbname=lesson1; host=localhost;", "root", "mysql");
    $stmt = $pdo->query("select * from 4each_keijiban");
        
    ?>
    
    
    <header>
        <div class="header-logo">
            <img src="4eachblog_logo.jpg">
        </div>
        
        <div class="header-list">
            <ul>
                <li>トップ</li>
                <li>プロフィール</li>
                <li>4eachについて</li>
                <li>登録フォーム</li>
                <li>問い合わせ</li>
                <li>その他</li>
            </ul>
        </div>
    </header>

    <main>
        <div class="main-container">
            <div class="main-left">
                <h1>プログラミングに役立つ掲示板</h1>
                
                <form method="post" action="insert.php">
                    <h2>入力フォーム</h2>
                    
                    <div>
                        <label>ハンドルネーム</label>
                        <br>
                        <input type="text" class="handlename" name="handlename" size=20> 
                    </div>
                    
                    <div>
                        <label>タイトル</label>
                        <br>
                        <input type="text" class="title" name="title" size=20>
                    </div>
                    
                    <div>
                        <label>コメント</label>
                        <br>
                        <textarea cols=30 rows=7 name="comments"></textarea>
                    </div>
                    
                    <div>
                        <input type="submit" value="投稿する" class="form-submit">
                    </div>
                </form>
                
                <?php
                
                while($row = $stmt->fetch()){
                
                    echo "<div class = 'kiji'>";
                    echo "<h3>".$row['title']."</h3>";
                    echo "<div class='contents'>";
                    echo $row['comments'];
                    echo "<div class='handlename'>posted by".$row['handlename']."</div>";
                    echo "</div>";
                    echo "</div>";
                }
                
                ?>
                    
            </div>
            
            <div class="main-right">
                <div class="entry right">
                    <h2>人気の記事</h2>
                    <p>PHPオススメ本</p>
                    <p>PHP MyAdminの使い方</p>
                    <p>今人気のエディタ Top5</p>
                    <p>HTMLの基礎</p>
                </div>
                
                <div class="link right">
                    <h2>オススメリンク</h2>
                    <p>インターノウス株式会社</p>
                    <p>XAMPP4のダウンロード</p>
                    <p>Eclipseのダウンロード</p>
                    <p>Bracketsのダウンロード</p>
                </div>
                
                <div class="category right">
                    <h2>カテゴリ</h2>
                    <p>HTML</p>
                    <p>PHP</p>
                    <p>MySQL</p>
                    <p>JavaScript</p>
                </div>
            </div>
        </div>
    </main>
    
    <footer>
        copyright (c) internous | 4each blog is the one which provides A to Z about programing.
    </footer>
    
</body>
</html>