
<nav class="navbar navbar-default navbar-sacsa" role="navigation">
	<div class="container">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-ex1-collapse">
				<span class="sr-only">Toggle navigation</span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
			<a class="navbar-brand navbar-sacsa-name">
				<img class="img-responsive sacsa sacsa-logo" alt=""
					data-id="${model?.navbar?.logo?.id }"
					src="${model?.navbar?.logo?.src }">
				<span class="sacsa-titulo-uno disabled" style="white-space: nowrap;"
					data-id="${model?.navbar?.titulo1?.id }">
					${model?.navbar?.titulo1?.html }
				</span>
				<span style="white-space: nowrap;display:block">
					<span class="sacsa-titulo-dos  disabled"
						data-id="${model?.navbar?.titulo2?.id }">
						${model?.navbar?.titulo2?.html }
					</span>
					<span data-id="${model?.navbar?.titulo3?.id }"
						class="sacsa-titulo-tres">
						${model?.navbar?.titulo3?.html }
					</span>
				</span>
			</a>
		</div>
		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse navbar-ex1-collapse">
			<ul class="nav navbar-nav">
				<li>
					<g:link controller="main" action="index" class="sacsa-inicio"
						data-id="${model?.navbar?.inicio?.id }">
						${model?.navbar?.inicio?.html }
					</g:link>
				</li>
				<li class="dropdown">
					<g:link controller="main" action="servicio" class="dropdown-toggle"
						data-toggle="dropdown" class="sacsa-servicios"
						data-id="${model?.navbar?.servicios?.id }">
						${model?.navbar?.servicios?.html }
					</g:link>
					<ul class="dropdown-menu">
						<li>
							<g:link controller="servicio" action="terrestres"
								class="sacsa-terrestres"
								data-id="${model?.navbar?.terrestres?.id }">
								${model?.navbar?.terrestres?.html }
							</g:link>
						</li>
						<li>
							<g:link controller="servicio" action="hidraulicos"
								class="sacsa-hidraulicos"
								data-id="${model?.navbar?.hidraulicos?.id }">
								${model?.navbar?.hidraulicos?.html }
							</g:link>
						</li>
						<li>
							<g:link controller="servicio" action="industriales"
								class="sacsa-industriales"
								data-id="${model?.navbar?.industriales?.id }">
								${model?.navbar?.industriales?.html }
							</g:link>
						</li>
						<li>
							<g:link controller="servicio" action="subcontratacion"
								class="sacsa-subcontratacion"
								data-id="${model?.navbar?.subcontratacion?.id }">
								${model?.navbar?.subcontratacion?.html }
							</g:link>
						</li>
					</ul>
				</li>
				<li>
					<g:link controller="main" action="portafolio"
						class="sacsa-maquinarias"
						data-id="${model?.navbar?.maquinaria?.id }">
						${model?.navbar?.maquinaria?.html }
					</g:link>
				</li>
				<li class="dropdown ">
					<g:link controller="main" action="nosotros" class="sacsa-nosotros"
						data-id="${model?.navbar?.nosotros?.id }">
						${model?.navbar?.nosotros?.html }
					</g:link>
				</li>
				<li class="dropdown ">
					<g:link controller="main" action="contacto" class="sacsa-contacto"
						data-id="${model?.navbar?.contacto?.id }">
						${model?.navbar?.contacto?.html }
					</g:link>
				</li>
				<li class="dropdown ">
					<g:link controller="main" action="empleo" class="sacsa-empleo"
						data-id="${model?.navbar?.empleo?.id }">
						${model?.navbar?.empleo?.html }
					</g:link>
				</li>
			</ul>
			<!-- /.nav -->
		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container -->
</nav>
<!-- /.navbar -->