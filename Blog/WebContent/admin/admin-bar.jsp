<div class="navbar navbar-inverse navbar-static-top">
	<div class="navbar-inner">
		<div class="container">
			<a class="btn btn-navbar" data-toggle="collapse"
				data-target=".nav-collapse"> <span class="icon-bar"></span> <span
				class="icon-bar"></span> <span class="icon-bar"></span>
			</a> <a class="brand" href="./">PWebBlog</a>

			<div class="nav-collapse collapse">
				<ul class="nav">
					<li class="divider-vertical"></li>
					<li><a href="./"><i class="icon-home icon-white"></i> Home</a></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown"><i class="icon-pencil icon-white"></i>
						Artigos <i class="caret"></i></a>
						<ul class="dropdown-menu">
							<li><a href="cadastrar-artigo"><i class="icon-plus-sign"></i> Adicionar
									Novo</a></li>
							<li><a href="listar-artigos"><i class="icon-list"></i> Listar todos</a></li>
						</ul>
					</li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown"><i class="icon-tags icon-white"></i>
						Categorias <i class="caret"></i></a>
						<ul class="dropdown-menu">
							<li><a href="cadastrar-categoria"><i class="icon-plus-sign"></i> Adicionar
									Nova</a></li>
							<li><a href="listar-categorias"><i class="icon-list"></i> Listar todas</a></li>
						</ul>
					</li>
					<li class="dropdown"><a href="listar-comentarios"><i class="icon-comment icon-white"></i>
						Comentarios</a>
					</li>
				</ul>
				<div class="pull-right">
					<ul class="nav pull-right">
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown"><i class="icon-user icon-white"></i> ${ sessionScope.user.nome } <b class="caret"></b></a>
							<ul class="dropdown-menu">
								<li><a href="/user/preferences"><i class="icon-cog"></i>
										Editar perfil</a></li>
								<li class="divider"></li>
								<li><a href="logout"><i class="icon-off"></i>
										Sair</a></li>
							</ul>
						</li>
					</ul>
				</div>
			</div>
		</div>
	</div>
</div>